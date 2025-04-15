abstract class CookingRecipe {

    // The template method
    public final void prepareDish() {
        prepareIngredients();
        preheatCookingEquipment();
        cook();
        if (customerWantsSauce()) {
            addSauce();
        }
        serve();
    }

    private void prepareIngredients() {
        System.out.println("Preparing ingredients");
    }

    protected abstract void preheatCookingEquipment();

    protected abstract void cook();

    protected boolean customerWantsSauce() {
        return false;
    }

    protected void addSauce() {
        System.out.println("Adding sauce");
    }


    private void serve() {
        System.out.println("Enjoying the food");
    }
}

// Pasta Recipe
class PastaRecipe extends CookingRecipe {

    @Override
    protected void preheatCookingEquipment() {
        System.out.println("Boiling water");
    }

    @Override
    protected void cook() {
        System.out.println("Cooking pasta");
    }

    @Override
    protected boolean customerWantsSauce() {
        return true;
    }

    @Override
    protected void addSauce() {
        System.out.println("Sprinkling toppings");
    }
}

//Chicken Recipe
class BakedChickenRecipe extends CookingRecipe {
    @Override
    protected void preheatCookingEquipment() {
        System.out.println("Preheating oven");
    }

    @Override
    protected void cook() {
        System.out.println("Baking chicken");
    }

    @Override
    protected boolean customerWantsSauce() {
        return true;
    }

    @Override
    protected void addSauce() {
        System.out.println("Adding BBQ");
    }
}


public class Cooking {
    public static void main(String[] args) {
        System.out.println("=== Preparing Pasta ===");
        CookingRecipe pasta = new PastaRecipe();
        pasta.prepareDish();

        System.out.println("\n=== Preparing Baked Chicken ===");
        CookingRecipe chicken = new BakedChickenRecipe();
        chicken.prepareDish();
    }
}

