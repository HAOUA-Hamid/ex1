package complexe;
import java.util.ArrayList;
public class ListComplexe extends ArrayList<Complexe> {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<Complexe> c;
    @Override
    public boolean add(Complexe c) { if(this.contains(c)) {
    	
    	return false;
    }super.add(c);
	return true; }
    public Complexe somme() {
    	Complexe S=new Complexe();
    	for(int i=0; i < size(); i++) {
            S=S.add(this.get(i));
        }
    	return S;
    }  
    
}
