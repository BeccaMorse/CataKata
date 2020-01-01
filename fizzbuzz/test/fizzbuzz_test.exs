defmodule FizzbuzzTest do
  use ExUnit.Case
  doctest Fizzbuzz

  test "fizz 1" do
    assert Fizzbuzz.fizz(1) == 1
  end

  test "fizz 2" do
    assert Fizzbuzz.fizz(2) == 2
  end

  test "fizz 3" do
    assert Fizzbuzz.fizz(3) == :fizz
  end
end
