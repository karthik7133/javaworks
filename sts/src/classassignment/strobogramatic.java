package classassignment;



public class strobogramatic {
    public static void main(String[] args) {
        String a = "8608";
        boolean flag = true;
        
        for (int i = 0; i < a.length(); i++) {
            char current = a.charAt(i);
            char mirrored = a.charAt(a.length() - 1 - i);

            if (current == '6') {
                if (mirrored != '9') {
                    flag = false;
                    break;
                }
            } else if (current == '9') {
                if (mirrored != '6') {
                    flag = false;
                    break;
                }
            } else if (current == '8') {
                if (mirrored != '8') {
                    flag = false;
                    break;
                }
            } else if (current == '1') {
                if (mirrored != '1') {
                    flag = false;
                    break;
                }
            } else if (current == '0') {
                if (mirrored != '0') {
                    flag = false;
                    break;
                }
            } else {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
