package davidhxxx.teach.designpattern.adapter.zoo.composition;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import davidhxxx.teach.designpattern.adapter.zoo.common.Animal;
import davidhxxx.teach.designpattern.adapter.zoo.common.Zebra;
import davidhxxx.teach.designpattern.adapter.zoo.composition.ZooWithComposition;
import junit.framework.Assert;

public class ZooWithCompositionTest {

    private ZooWithComposition zoo;

    @Before
    public void setup() {
	zoo = new ZooWithComposition();
    }

    @Test
    public void addAnimal_adds_an_animal_retrievable_with_find_animals_but_is_not_modifiable() throws Exception {
	final Zebra animalAdded = new Zebra();

	// action
	zoo.addAnimal(animalAdded);
	// assertion
	List<Animal> animals = zoo.findAnimals();
	Assert.assertEquals(1, animals.size());
	Assert.assertSame(animalAdded, animals.get(0));

	boolean isExceptionWhenAdded = false;
	try {
	    animals.remove(0);
	}
	catch (UnsupportedOperationException e) {
	    isExceptionWhenAdded = true;
	}
	Assert.assertTrue("exception expected when adding", isExceptionWhenAdded);
    }
    

}
