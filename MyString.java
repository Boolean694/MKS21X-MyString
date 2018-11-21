public class MyString implements CharSequence,Comparable<CharSequence> {
    private char[] data;
    public int length() {
        return data.length;
    }
    public char charAt(int g) {
        return data[g];
    }
    public String toString() {
        String s = "";
        for(int q = 0; q < data.length; q++) {
            s += data[q];
        }
        return s;
    }
    public CharSequence subSequence(int s, int e) {
        char[] n = new char[(e - s) + 1];
        for(int q = s; q <= e; q++) {
            n[q - s] = data[q];
        }
        CharSequence cs = new CharSequence(n);
        return cs;
    }
    public int compareTo(CharSequence a) {
        int wer = 0;
        if(a.length() > this.length()) {wer = -1}
    }
    public MyString(CharSequence s) {
        data = new char[s.length()];
        for(int q = 0; q < s.length(); q++) {
            data[q] = s.charAt(q);
        }
    }
    
}
