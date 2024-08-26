class Weapon {
    void fire() {
    };
}

class Laser extends Weapon {
    @Override
    void fire() {
        System.out.println("Firing laser!");
    }
}

class Missile extends Weapon {
    @Override
    void fire() {
        System.out.println("Launching missile!");
    }
}

class Cannon extends Weapon {
    @Override
    void fire() {
        System.out.println("Shooting cannon!");
    }
}

class Robot {
    private Weapon[] weapons;

    public Robot() {
        weapons = new Weapon[2];
        weapons[0] = weapons[1] = null;
    }

    public void equipWeapon(int slot, Weapon weapon) {
        if (slot < 0 || slot >= weapons.length) {
            System.out.println("Invalid slot number");
            return;
        }
        weapons[slot] = weapon;
    }

    public void attack() {
        for (Weapon weapon : weapons) {
            if (weapon != null) {
                weapon.fire();
            } else {
                System.out.println("No weapon in this slot");
            }
        }
    }
}

public class RobotDemo {
    public static void main(String[] args) {
        Robot robot = new Robot();

        // 무기 생성
        Weapon laser = new Laser();
        Weapon missile = new Missile();
        Weapon cannon = new Cannon();

        // 로봇에 무기 장착
        robot.equipWeapon(0, laser);

        // 로봇 공격
        System.out.println("Robot attacking with equipped weapons:");
        robot.attack();

        // 로봇에 무기 장착
        robot.equipWeapon(1, missile);
        System.out.println("\nRobot attacking with equipped weapons:");
        robot.attack();

        // 무기 교체
        robot.equipWeapon(1, cannon);

        // 로봇 다시 공격
        System.out.println("\nRobot attacking with new weapon configuration:");
        robot.attack();
    }
}

