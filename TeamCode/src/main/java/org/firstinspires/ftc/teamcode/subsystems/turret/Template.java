package org.firstinspires.ftc.teamcode.subsystems.turret;

import com.arcrobotics.ftclib.controller.PIDController;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Template {

    // instantiate static variables below

    // instantiate instance variables below
    private DcMotorEx turretMotor;
    public Template(HardwareMap hardwareMap) {
    }

    public void update() {
        // updating turret angle
        int turretEncoder = turretMotor.getCurrentPosition();
        // calculate targetAngle below


        // add your switch statement below

    }

    public void printTelemetry(Telemetry telemetry) {
    }

    // your getters and setters go below

}
