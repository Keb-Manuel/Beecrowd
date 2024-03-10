package main
import(
	"fmt"
)
func main(){
	var pi= 3.14159
	var num float64
	fmt.Scan(&num)
	area:= pi * (num*num)
	fmt.Printf("A=%.4f\n",area)
}