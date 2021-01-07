package _06_tea_party;

public class TeApArtY {
	    public String welcome(String name, boolean isWoman, boolean isKnighted) {
	    	 if (isWoman && isKnighted) {
	 	 		return "Hello Lady " + name;	
	 	 		}
	    	 if (isWoman && isKnighted == false) {
	 	 		return "Hello Ms. " + name;	
	 	 		}
	    	 if (isKnighted && isWoman == false) {
	 	 		return "Hello Sir " + name;	
	 	 		}
	    	 if (isWoman == false && isKnighted == false) {
	 	 		return "Hello Mr. " + name;	
	 	 		}
	    	
	    	return name; 
	    }	
}

