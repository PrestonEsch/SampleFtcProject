package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "test me twin")
public class SampleTeleop extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        while (opModeIsActive()) {
           telemetry.addData("fdafdas'", 1423);

           telemetry.update();
        }
    }
}
