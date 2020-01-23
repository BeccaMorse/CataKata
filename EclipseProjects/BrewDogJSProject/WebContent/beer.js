/**
 * References used:
 * https://www.taniarascia.com/how-to-connect-to-an-api-with-javascript/
 * http://jsonviewer.stack.hu/
 * https://www.geeksforgeeks.org/html-dom-button-object/
 * https://www.w3schools.com/howto/howto_js_toggle_hide_show.asp
 * Nathan Morse (helped me ask the right questions)
 */
document.addEventListener('DOMContentLoaded', () => {

const app = document.getElementById('root')
const logo = document.createElement('img')
logo.src = 'doggo.png'

const logo2 = document.createElement('img')
logo2.src = 'dog.jpg'
	
const container = document.createElement('div')
container.setAttribute('class', 'container')
container.style.display = 'flex'

app.appendChild(logo)
app.appendChild(container)
//app.appendChild(logo2)

var xmlHttpRequest = new XMLHttpRequest()
const API_URL="https://api.punkapi.com/v2/beers"

xmlHttpRequest.open('GET', API_URL, true)

xmlHttpRequest.onload = function () {
	
	var beerMenu = JSON.parse(this.response)
	
	if (xmlHttpRequest.status >= 200 && xmlHttpRequest.status <400) {
		beerMenu.forEach(beer => {
			const card = document.createElement('div')
			card.setAttribute('class', 'card')
			
			const h3 = document.createElement('h3')
			h3.textContent = beer.name
			
			const img = document.createElement('img')
			img.setAttribute('src', beer.image_url)
			img.setAttribute('id','bottle')
			
			const p = document.createElement('p')
			p.textContent = beer.description
				
			const detailsButton = document.createElement('button')
			const buttonText = document.createTextNode("More about " + beer.name)
			detailsButton.setAttribute('id','details')
			detailsButton.setAttribute('onClick','showDetails()')
			detailsButton.appendChild(buttonText)
				
			const detailsSection = document.createElement('div')
			detailsSection.setAttribute('id','moreAbout')
			detailsSection.style.display = 'none'
			
			const moreAbout = document.createElement('h5')
			moreAbout.textContent = beer.name + ": " + beer.tagline
			const abv = document.createElement('p')
			abv.textContent = 'Alcohol by volume: ' + beer.abv
			const foodPairing = document.createElement('p')
			foodPairing.textContent = 'Amazing Food Pairings: '+ beer.food_pairing
			
			
			container.appendChild(card)
		
			detailsSection.appendChild(moreAbout).appendChild(abv).appendChild(foodPairing)
			
			card.appendChild(h3)
			card.appendChild(img)
			card.appendChild(p)
			card.appendChild(detailsButton)
			card.appendChild(detailsSection)	

			
			
//			console.log(beer.name, beer.description, beer.image_url)			
		})
	} else { 
		const errorMessage = document.createElement('h1')
		errorMessage.textContent = 'Unable to Load'
		app.appendChild(errorMessage)
		
		console.log('oopsie')
	}
}

function showDetails() {
	var show = document.getElementById("detailsSection")
	if (detailsSection.style.display === "none") {
		detailsSection.style.display = "block";
	} else {
		detailsSection.style.display = "none";
	}
}

xmlHttpRequest.send()
	
});