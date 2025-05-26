package abstact_and_interface_practice;

class HelloWorld {
    public static void main(String[] args) {
        String str = "Capgemini@123";
        int n = str.length();
        System.out.println(str);
        StringBuffer str2 = new StringBuffer("");
        for(int i = 0; i < n; i++){
            if((str.charAt(i)>= 65 && str.charAt(i) <=90) || (str.charAt(i)>= 97 && str.charAt(i) <=122))
                str2.append(str.charAt(i));
        }
        System.out.println("Modified String: " + str2);

    }
}
