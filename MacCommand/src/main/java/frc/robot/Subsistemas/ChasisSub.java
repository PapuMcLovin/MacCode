package frc.robot.Subsistemas;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ChasisSub extends SubsystemBase {

//En esta nueva version de WPIVScodde para programar nuestro chasis es un poco diferente ya que 
//anteriormente exixtia lo que es el "MotorControllerGroup" pero como ya no existe este comando 
//lo que debemos hacer es una "metodo" o "clase" para hacer que un motor siga a otro con el 
//comando ".follow", con esto logramos tener un motor prinsipal que al llamarlo nuestro otro
//motor siempre lo siga.

    //Moteres Derechos
static WPI_TalonSRX mD1Enc = new WPI_TalonSRX (1);
static WPI_TalonSRX mD2 = new WPI_TalonSRX (2);

    //Motores Derechos
static WPI_TalonSRX mI1Enc = new WPI_TalonSRX (3);
static WPI_TalonSRX mI2 = new WPI_TalonSRX (4);

    //Agrupacion Diferencial 
DifferentialDrive chasis = new DifferentialDrive(mD1Enc, mI1Enc);

    //Metodo para invertir motores y que uno siga al otro 
  public static void MotorAgrup (){

    //invierte los motores Izquierdos
    mI1Enc.setInverted(true);
    mI2.setInverted(true);

    //invierte los motores Derechos
    mD1Enc.setInverted(false);
    mD2.setInverted(false);

    //Comando para seguir los motores
    mD2.follow(mD1Enc); //Derecho
    mI2.follow(mI1Enc); //Izquierdo
  }

    //Salida de los motores para utilizarlos en Cmd
  public void Motores (double VelD, double VelI) {

    mD1Enc.set(VelD);
    mI1Enc.set(VelI);
  }

  public ChasisSub() {}

  @Override
  public void periodic() {}

  @Override
  public void simulationPeriodic() {}

}
