public class primerInnerClassAnonymus {
        // скопировать с Юриного gпервый сценарий
    // ниже представлен второй сценарий
    interface Cookable {
        public void cook (){
        }
        class Food {
        Cookable c = new Cookable() {
            public void cook() {
                System.out.println("anonymous cookable implement");
            }
        };
        }
}
