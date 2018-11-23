public class MyString implements CharSequence,Comparable<CharSequence> {
    private char[] data;
    public int length() {
        return data.length;
    }
    public char charAt(int g) {
		if(g < 0 || g >= this.length()){throw new IndexOutOfBoundsException();}
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
		if(s < 0 || e < 0 || s >= this.length() || e >= this.length()){throw new IndexOutOfBoundsException();}
        String g = "";
        for(int q = s; q <= e; q++) {
            g += data[q];
        }
        return g;
    }
    public int compareTo(CharSequence a) {
		if(a == null){throw new NullPointerException();}
        int wer = 0;
        if(a.length() > this.length()) {wer = -1;}
		else if(a.length() < this.length()) {wer = 1;}
		else{wer = 0;}
		if(wer == -1 || wer == 0) {
			for(int q = 0; q < this.length(); q++) {
				if(a.toString().charAt(q) > data[q]){return -1;}
				else if(a.toString().charAt(q) < data[q]){return 1;}
				else{q += 0;}
			}
			return 0;
		}
		else {
			for(int q = 0; q < a.length(); q++) {
				if(a.toString().charAt(q) > data[q]){return -1;}
				else if(a.toString().charAt(q) < data[q]){return 1;}
				else{q += 0;}
			}
			return 0;
		}
    }
    public MyString(CharSequence s) {
		if(s.length() <= 0){throw new IndexOutOfBoundsException();}
        data = new char[s.length()];
        for(int q = 0; q < s.length(); q++) {
            data[q] = s.charAt(q);
        }
    }
}
