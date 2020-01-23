/**
 * References used:
 * https://www.taniarascia.com/how-to-connect-to-an-api-with-javascript/
 * http://jsonviewer.stack.hu/
 * Nathan Morse (helped me ask the right questions)
 */
document.addEventListener('DOMContentLoaded', () => {

const app = document.getElementById('root')
const logo = document.createElement('img')
logo.src = 'doggo.png'
	
const container = document.createElement('div')
container.setAttribute('class', 'container')

app.appendChild(logo)
app.appendChild(container)

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
			
			const p = document.createElement('p')
			p.textContent = beer.description
				
			
				
			container.appendChild(card)
			
			card.appendChild(h3)
			card.appendChild(img)
			card.appendChild(p)
			
			
			console.log(beer.name, beer.description, beer.image_url)
			
//			document.getElementById('root').appendChild(document.createElement('div'))
			
		})
	} else { 
		const errorMessage = document.createElement('h1')
		errorMessage.textContent = 'Unable to Load'
		app.appendChild(errorMessage)
		
		console.log('oopsie')
	}
}

xmlHttpRequest.send()
	
});