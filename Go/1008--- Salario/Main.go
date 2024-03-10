package main
import(
	"fmt"
)
func main(){
	var a int 
	var b float64
	var c float64
	fmt.Scan(&a)
	fmt.Scan(&b)
	fmt.Scan(&c)
	salario:= b *c
	fmt.Print("NUMBER = ", a, "\n")
	fmt.Printf("SALARY = U$ %.2f\n", salario)
}