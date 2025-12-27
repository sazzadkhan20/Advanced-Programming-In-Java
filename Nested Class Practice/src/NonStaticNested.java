public class NonStaticNested {

    // Varargs: Variable-Length Arguments
    void fun(String... args)
    {
        for(String s: args){
            System.out.println(s);
        }
    }
    // Nonstatic Nested Class
     class Converter
    {
         double celciusToFarenheit(float celcius)
        {
            return (celcius * 1.8 + 32);
        }
    }
}
