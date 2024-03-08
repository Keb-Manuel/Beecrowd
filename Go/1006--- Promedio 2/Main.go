package main
import(
	"fmt"
)
func main(){
	var num1 float64
	var num2 float64
	var num3 float64
	fmt.Scan(&num1)
	fmt.Scan(&num2)
	fmt.Scan(&num3)
	promedio := ((num1*2)+(num2*3)+(num3*5))/10
	fmt.Printf("MEDIA = %.1F\n", promedio)
}