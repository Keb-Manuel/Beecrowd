package main
import(
	"fmt"
)
func main(){
	var num1 float64
	var num2 float64
	fmt.Scan(&num1)
	fmt.Scan(&num2)
	promedio:=((num1*3.5)+(num2*7.5))/11
	fmt.Printf("MEDIA = %.5f\n", promedio)
}