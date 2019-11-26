public class FactoryImpl extends Factory{

    @Override
    public Dao createDao() {
        return new InMemoryBookDao();
    }
}
