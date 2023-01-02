package headfirst.designpatterns.command.undo;

public class DimmerLightOnCommand implements Command {
    Light light;
    int prevLevel;

    public DimmerLightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        prevLevel = light.getLevel();
        light.dim(75);
    }

    @Override
    public void undo() {
        light.dim(prevLevel);
    }
}
