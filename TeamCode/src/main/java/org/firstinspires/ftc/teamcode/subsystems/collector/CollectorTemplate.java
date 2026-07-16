package org.firstinspires.ftc.teamcode.subsystems.collector;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

@Config
public class CollectorTemplate {
    
    public double in = 0.99;
    public double out = -0.99;

    // declare your instance data below
    private final DcMotorEx collectorMotor;
    private final Telemetry telemetry;
    
    public enum CollectorState {
        OFF,
        ON,
        OUT
    }
    private CollectorState collectorState;


    public CollectorTemplate(HardwareMap hardwareMap, Telemetry telemetry) {
        collectorMotor = hardwareMap.get(DcMotorEx.class, "collectorMotor");
        this.telemetry = telemetry;
    }

    public void update() {
        telemetry.addData("cState", collectorState);
        telemetry.addData("CPower", collectorMotor.getPower());
        telemetry.addData("Collector Motor", collectorMotor);
    }

    public CollectorState getCollectorState() {
        return collectorState;
    }
    public void setCollectorState(CollectorState intakeState) {
        if(this.collectorState == intakeState)
            return;

        this.collectorState = intakeState;
        switch(intakeState) {
            case OFF:
                collectorMotor.setPower(0);
                break;
            case ON:
                collectorMotor.setPower(in);
                break;
            case OUT:
                collectorMotor.setPower(out);
                break;
        }
    }
}

    // finish these functions below
    