import java.util.Set;
import java.util.HashSet;

public class SetOperations<E> {
	Set<E> setA;
	Set<E> setB;

	public SetOperations() {
		setA=new HashSet<>();
		setB=new HashSet<>();
	}
	public Set<E> union(Set<E> setA, Set<E> setB){
		Set<E> unionSet= new HashSet<>();
		for(E element:setA) {
			unionSet.add(element);
			
		}
		for(E element:setB) {
			unionSet.add(element);
		}
		return unionSet;
	}
	public Set<E> intersection(Set<E> setA, Set<E> setB) {
		Set<E> intersectionSet= new HashSet<>();
		for(E element: setA) {
			if(setB.contains(element)) {
				intersectionSet.add(element);
			}
		}
		return intersectionSet;
    }
	public Set<E> difference(Set<E> setA, Set<E> setB) {
		Set<E> differenceSet= new HashSet<>();
		for(E element: setA) {
			if(!setB.contains(element)) {
				differenceSet.add(element);
			}
		}
		return differenceSet;
    }
	public Set<E> symmetricDifference(Set<E> setA, Set<E> setB){
		Set<E> symetricSet= new HashSet<>();
		for(E element:setA) {
			if(!setB.contains(element)){
				symetricSet.add(element);
			}
		}
		for(E element:setB) {
			if(!setA.contains(element)){
				symetricSet.add(element);
			}
		}
		return symetricSet;
	}


}
