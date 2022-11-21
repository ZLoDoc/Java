public class task3 {
    public static void main(String[] args) {
        String[] array = {"abcdefgabcabc", "abcgkjsdfkl", "bvxabchcbdf", "qwerabctwet", "abc"};
        String value = "abc";
        for (int i = 0; i < array.length; i++){
            if (array[i].substring(0, 3).equals(value)){
                System.out.println(i);
            }
            }
        }

    }
