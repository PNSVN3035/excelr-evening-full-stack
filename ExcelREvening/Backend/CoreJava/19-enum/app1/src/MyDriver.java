import java.lang.reflect.Method;
interface InterfaceMethods
{
	
}
class MyDriver
{
	public static void main(String[] args)
    {
		Class<?> ref = InterfaceMethods.class;

        System.out.println("Methods in class " + ref.getSimpleName() + ":");
        Method[] methods = ref.getMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }
	}
}
