package main
import(
	"fmt"
)
func main(){
	var num1 int
	var num2 int
	fmt.Scan(&num1)
	fmt.Scan(&num2)
	suma := num1 + num2
	fmt.Print("SOMA = ", suma, "\n")
}