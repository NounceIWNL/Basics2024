package Lesson08_02_2024;

import java.util.ArrayList;
import java.util.List;

public class FuncInterfaces {
    public static void main(String[] args) {
        //Класс, объект, конструктор
        //Функциональное выражение
        ElectricalDevice lamp = state -> {
            System.out.println(state ? "лампочка включена" : "лампочка выключена");
        };

        Button button = new Button(state -> {
            System.out.println(state ? "лампочка включена" : "лампочка выключена");
        });
        button.switchOnOff();
        button.switchOnOff();


//button.switchOnOff();

        Button button1 = new Button(new Iron()); //анонимный объект
        button1.switchOnOff();

        new Button(new ElectricalDevice() { //Анонимный класс, анонимный объект
            @Override
            public void switchOnOff(boolean state) {
                System.out.println(state ? "фен включен" : "фен выключен");
            }
        }).switchOnOff();
        Iron iron = new Iron();

//        ButtonEx buttonEx = new ButtonEx(new Iron);
//        buttonEx.switchOnOff();

    }
}

//Электрическая кнопка
class Button {
    protected boolean state = false; //Кнопка выключена
    private ElectricalDevice device;

    public Button() {
    }

    public Button(ElectricalDevice device) {
        this.device = device;
    }

    public void switchOnOff() {
        state = !state;
        if (state)
            System.out.println("Кнопка включена");
        else
            System.out.println("Кнопка выключена");
        device.switchOnOff(state);
    }
}

@FunctionalInterface
interface ElectricalDevice {
    void switchOnOff(boolean state); //Только один
}

class Iron implements ElectricalDevice {

    @Override
    public void switchOnOff(boolean state) {
        System.out.println(state ? "утюг включен" : "утюг выключен");
    }
}

class ButtonEx extends Button {
    private List<ElectricalDevice> devices;

    public ButtonEx(List<ElectricalDevice> devices) {
        this.devices = devices;
    }

    public void switchOnOff() {
        state = !state;
        if (state)
            System.out.println("Кнопка включена");
        else
            System.out.println("Кнопка выключена");

        for (ElectricalDevice device : devices)
            device.switchOnOff(state);
    }
}