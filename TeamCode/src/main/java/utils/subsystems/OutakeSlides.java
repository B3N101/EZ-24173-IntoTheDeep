package utils.subsystems;

import org.firstinspires.ftc.teamcode.controllers.PIDFController;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class OutakeSlides extends LinearOpMode {
    private PIDFController examplePIDF = new PIDFController(0, 0, 0, 0);


}


//
//import androidx.annotation.NonNull;
//import com.acmerobotics.dashboard.FtcDashboard;
//import com.acmerobotics.dashboard.config.Config;
////import com.arcrobotics.ftclib.controller.PIDFController;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.DcMotorEx;
//import com.qualcomm.robotcore.hardware.DcMotorSimple;
//import com.qualcomm.robotcore.hardware.HardwareMap;
//import dev.frozenmilk.dairy.core.dependency.Dependency;
//import dev.frozenmilk.dairy.core.dependency.annotation.SingleAnnotation;
//import dev.frozenmilk.dairy.core.wrapper.Wrapper;
//import dev.frozenmilk.mercurial.commands.Lambda;
//import dev.frozenmilk.mercurial.subsystems.Subsystem;
//import kotlin.annotation.MustBeDocumented;
//import org.firstinspires.ftc.robotcore.external.Telemetry;
//import org.firstinspires.ftc.robotcore.external.navigation.CurrentUnit;
////import org.firstinspires.ftc.teamcode.util.Names;
//
//import java.lang.annotation.*;
//
//public class OutakeSlides implements  Subsystem {
//    public static final OutakeSlides INSTANCE = new OutakeSlides();
//    public static DcMotorEx slideR;
//    public static DcMotorEx slideL;
//
//    public static double maxHeight = 283 * 3;
//    public static double startHeight = 0;
//    public static double spoolDiameter = 35;
//    public static double spoolCircumference = spoolDiameter * Math.PI;
//    public static double TotalRotations = maxHeight/spoolCircumference;
//
//    public static Telemetry telemetry;
//    FtcDashboard dashboard;
//    static Telemetry dashboardTelemetry;
//    public static double maxCurrentLimit = 3500;
//    public static double regressionCurrentLimit = 800;
//    private static double currentL = 0, currentR = 0;
//
//    @Override
//    public void preUserInitHook(@NonNull Wrapper opMode) {
//        HardwareMap hMap = opMode.getOpMode().hardwareMap;
//        telemetry = opMode.getOpMode().telemetry;
//
//        dashboardTelemetry = FtcDashboard.getInstance().getTelemetry();
//
//        slideL = hMap.get(DcMotorEx.class, "leftExt");
//        slideR = hMap.get(DcMotorEx.class, "rightExt");
//        slideR.setCurrentAlert(maxCurrentLimit, CurrentUnit.MILLIAMPS);
//        slideL.setCurrentAlert(maxCurrentLimit, CurrentUnit.MILLIAMPS);
//        slideR.setDirection(DcMotorSimple.Direction.REVERSE);
//        slideL.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        slideR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        reset();
//    }
//
//    public static void reset() {
//        slideL.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        slideR.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        slideL.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
//        slideR.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
//    }
//
//    @NonNull
//    @Override
//    public Dependency<?> getDependency() {
//        return null;
//    }
//
//    @Override
//    public void setDependency(@NonNull Dependency<?> dependency) {
//
//    }
//}
