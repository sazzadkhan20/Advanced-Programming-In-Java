import java.util.Vector;

public class FormValidator {

    static Vector<String> block_domains = new Vector<>();

    static void loadBlockDomains()
    {
        block_domains.add("example");
        block_domains.add("smtp");
        block_domains.add("ftp");
    }
    // Load one time
    static
    {
        loadBlockDomains();
    }
    // Static Nested Calss
    static class EmailHelper
    {
        static boolean domainChecker(String email)
        {
            String email_domain = "";
            for(int i=0; i<email.length(); i++)
            {
                if(email.charAt(i) == '@')
                {
                    while(i<email.length())
                    {
                        i++;
                        if(email.charAt(i) == '.')
                            break;
                        email_domain += email.charAt(i);
                    }

                }
            }
//            System.out.println(email_domain);
//            for(int i=0; i<block_domains.size(); i++) {
//                System.out.println(block_domains.get(i));
//            }
            for(int i=0; i<block_domains.size(); i++) {
                if (block_domains.get(i).equals(email_domain)) return true;
            }
            return false;
        }
        static String validateEmail(String email)
        {
            if(domainChecker(email)) return "blocked";
            for(int i=0; i<email.length(); i++)
            {
                if(email.charAt(i) == '@') return "valid";
            }
            return "invalid";
        }
    }
}
