package main
import(
	"fmt"
)
func main(){
	var num1 int
	var num2 int
	fmt.Scan(&num1)
	fmt.Scan(&num2)
	producto:= num1 * num2
	fmt.Print("PROD = ", producto,"\n")
}