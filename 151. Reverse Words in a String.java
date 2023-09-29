class Solution {
    public String reverseWords(String s) {
        		
		String[] op = s.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for(int i= op.length-1; i>=0;i--) {
			
			sb.append(op[i]).append(" ");
		}
		return sb.toString().trim();
    }
}
