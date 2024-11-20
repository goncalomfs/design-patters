public class StringReplacer implements StringTransformer {
    private char replacement;
    private char to_replace;

    public StringReplacer(char to_replace, char replacement) {
        this.to_replace = to_replace;
        this.replacement = replacement;
    }

    @Override
    public void execute(StringDrink drink) {
        String text = drink.getText();
        String newText = text.replace(to_replace, replacement);
        drink.setText(newText);
    }

    @Override
    public void undo(StringDrink drink) {
        String text = drink.getText();
        String newText = text.replace(replacement, to_replace);
        drink.setText(newText);
    }
}