package pack1;
import pack2.M;
import pack1.pack11.L;
import pack2.pack22.N;
class O
{
    public static void main(String[] args)
    {
        System.out.println("one");
        assert false;
        System.out.println("two");
        L.test2();
        System.out.println("three");
        N.test4();
        System.out.println("four");
        M.test3();
        System.out.println("five");
    }
}
/*
class wise -> -ea
for the sub-packages of that package -> -ea:pack2...
for different package particular class -> -ea:pack2.M
first we are enabling everywhere then disabling in the package's sub-packages -> -ea -da:pack1...
* first we are enabling everywhere then disabling in pack1 and subpackages of pack1 and disabling only for the pack2.pack22.N class, so the only class assertion is enabled as of now is pack2.M class which is why we get the error from pack2.M class -> -ea -da:pack1... -da:pack2.pack22.N
 */
