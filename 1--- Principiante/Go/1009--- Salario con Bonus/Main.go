package main
import(
	"fmt"
)
func main(){
	var nomb string
	var salario float64
	var venta float64
	fmt.Scan(&nomb)
	fmt.Scan(&salario)
	fmt.Scan(&venta)
	salarioConBonus:= salario+(venta*0.15)
	fmt.Printf("TOTAL = R$ %.2f\n", salarioConBonus)
}