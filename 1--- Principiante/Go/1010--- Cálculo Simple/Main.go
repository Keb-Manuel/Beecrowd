package main
import(
	"fmt"
)
func main(){
	var a, b, d, e float64
	var c, f float64
	fmt.Scan(&a)
	fmt.Scan(&b)
	fmt.Scan(&c)
	fmt.Scan(&d)
	fmt.Scan(&e)
	fmt.Scan(&f)
	totalPagar:= (b*c)+(e*f)
	fmt.Printf("VALOR A PAGAR: R$ %.2f\n", totalPagar)
}