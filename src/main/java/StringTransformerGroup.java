import java.util.List;

public class StringTransformerGroup implements StringTransformer {
    private List<StringTransformer> transformers;

    public StringTransformerGroup(List<StringTransformer> Transformers) {
        this.transformers = Transformers;
    }

    @Override
    public void execute (StringDrink drink) {
        for (StringTransformer transformer : transformers) {
            transformer.execute(drink);
        }
    }

    @Override
    public void undo (StringDrink drink) {
        for (StringTransformer transformer : transformers) {
            transformer.undo(drink);
        }
    }
}


