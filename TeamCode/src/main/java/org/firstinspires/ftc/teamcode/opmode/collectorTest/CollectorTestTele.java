package org.firstinspires.ftc.teamcode.opmode.collectorTest;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.subsystems.collector.CollectorChallengeAnswerKey;
import org.firstinspires.ftc.teamcode.subsystems.collector.CollectorTemplate;

@TeleOp(name="Collector Test Tele")
public class CollectorTestTele extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        telemetry = new MultipleTelemetry(telemetry, FtcDashboard.getInstance().getTelemetry());
        telemetry.setMsTransmissionInterval(20);

        CollectorTemplate collector = new CollectorTemplate(hardwareMap, telemetry);
        telemetry.addLine("Ready");
        telemetry.update();

        waitForStart();

        while(opModeIsActive()) {
            if(gamepad1.right_trigger > .1){
                collector.setCollectorState(CollectorTemplate.CollectorState.ON);
            }
            else if(gamepad1.left_trigger > .1)
                collector.setCollectorState(CollectorTemplate.CollectorState.OUT);
            else
                collector.setCollectorState(CollectorTemplate.CollectorState.OFF);

            collector.update();

            telemetry.update();
        }
    }
}


