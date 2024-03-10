package main
import(
	"fmt"
)
func main(){
	var a int
	var b int
	var c int
	var d int
	fmt.Scan(&a)
	fmt.Scan(&b)
	fmt.Scan(&c)
	fmt.Scan(&d)
	diferencia:= (a*b)-(c*d)
	fmt.Print("DIFERENCA = \n", diferencia)
}