import java.lang.reflect.Method;
class TotalMethods 
{
	public static void main(String[] args)
    {
		Class<?> ref = TotalMethods.class;

        System.out.println("Methods in class " + ref.getSimpleName() + ":");
        Method[] methods = ref.getMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }
	}
}
