package StarWarsArmada;

import java.io.Serializable;

/***************************************************************
*** Class Name: Ship
*** Class Author: Austin LeBel
****************************************************************
*** Purpose of the class: Creates a ship object
****************************************************************
*** Date: 04/26/2017
****************************************************************
***************************************************************/

public class Ship implements Serializable{
    // Hold ship class
    private String shipClass;
    // Holds make
    private String model;
    // Holds manufacturer
    private String manufacturer;
    // Holds shielding type
    private String shielding;
    // Holds hull type
    private int shipID;
    // Holds weapon type
    private String weapons;
    // Holds engine type
    private String engine;
    // Holds hyperdrive type
    private String hyperdrive;

/***************************************************************
*** Method Name: Ship() (Default Constructor)
*** Method Author: Austin LeBel
****************************************************************
*** Purpose of the Method: Default constructor with variables
*** set to null.
*** Method Inputs: N/A
*** Return Value: N/A
****************************************************************
*** Date: 04/26/2017
****************************************************************
***************************************************************/
    public Ship()
    {
        shipClass = "";
        model = "";
        manufacturer = "";
        shielding = "";
        shipID = 0;
        weapons = "";
        engine = "";
        hyperdrive = "";
    }
/***************************************************************
*** Method Name: Ship() (Constructor)
*** Method Author: Austin LeBel
****************************************************************
*** Purpose of the Method: Constructor to set initial variables.
*** Method Inputs: String c, String m, String mfr, String s,
*** String s, int id, String w, String e, String hd
*** Return Value: N/A
****************************************************************
*** Date: 04/26/2017
****************************************************************
***************************************************************/
    public Ship( String c, String m, String mfr, String s, int id, String w, String e, String hd)
    {
        shipClass = c;
        model = m;
        manufacturer = mfr;
        shielding = s;
        shipID = id;
        weapons = w;
        engine = e;
        hyperdrive = hd;
    }
/***************************************************************
*** Method Name: getShipClass
*** Method Author: Austin LeBel
****************************************************************
*** Purpose of the Method: Gets the ships class
*** Method Inputs: N/A
*** Return Value: String shipClass
****************************************************************
*** Date: 04/26/2016
****************************************************************
***************************************************************/    
    public String getShipClass()
    {
        return shipClass;
    }
/***************************************************************
*** Method Name: setShipClass 
*** Method Author: Austin LeBel
****************************************************************
*** Purpose of the Method: Sets the ships class
*** Method Inputs: String sc
*** Return Value: N/A
****************************************************************
*** Date: 04/26/2017
****************************************************************
***************************************************************/    
    public void setShipClass( String sc )
    {
        shipClass = sc;
    }
/***************************************************************
*** Method Name: getModel 
*** Method Author: Austin LeBel
****************************************************************
*** Purpose of the Method: Gets the model of the ship
*** Method Inputs: N/A
*** Return Value: String model
****************************************************************
*** Date: 04/26/2017
****************************************************************
***************************************************************/    
    public String getModel()
    {
        return model;
    }
/***************************************************************
*** Method Name: setModel
*** Method Author: Austin LeBel
****************************************************************
*** Purpose of the Method: Sets the model of the ship
*** Method Inputs: String m
*** Return Value: N/A
****************************************************************
*** Date: 04/26/2017
****************************************************************
***************************************************************/    
    public void setModel( String m )
    {
        // Set the model
        model = m;
    }
/***************************************************************
*** Method Name: getManufacturer 
*** Method Author: Austin LeBel
****************************************************************
*** Purpose of the Method: Gets the ships manufacturer
*** Method Inputs: N/A
*** Return Value: String manufacturer
****************************************************************
*** Date: 04/26/2017
****************************************************************
***************************************************************/    
    public String getManufacturer()
    {
        return manufacturer;
    }
/***************************************************************
*** Method Name: setManufacturer
*** Method Author: Austin LeBel
****************************************************************
*** Purpose of the Method: Sets the ships manufacturer
*** Method Inputs: String mf
*** Return Value: N/A
****************************************************************
*** Date: 04/26/2017
****************************************************************
***************************************************************/     
    public void setManufacturer( String mf )
    {
        manufacturer = mf;
    }
/***************************************************************
*** Method Name: getShielding
*** Method Author: Austin LeBel
****************************************************************
*** Purpose of the Method: Gets the ships shielding
*** Method Inputs: N/A
*** Return Value: String shielding
****************************************************************
*** Date: 04/26/2017
****************************************************************
***************************************************************/   
    public String getShielding()
    {
        return shielding;
    }
/***************************************************************
*** Method Name: setShielding
*** Method Author: Austin LeBel
****************************************************************
*** Purpose of the Method: Sets the ships shielding.
*** Method Input: String s
*** Return Value: N/A
****************************************************************
*** Date: 04/26/2017
****************************************************************
***************************************************************/     
    public void setShielding( String s )
    {
        shielding = s;
    }
/***************************************************************
*** Method Name: getShipID
*** Method Author: Austin LeBel
****************************************************************
*** Purpose of the Method: Gets the ships id
*** Method Input: N/A
*** Return Value: int shipID
****************************************************************
*** Date: 04/26/2017
****************************************************************
***************************************************************/
    public int getShipID()
    {
        return shipID;
    }
/***************************************************************
*** Method Name: setShipID
*** Method Author: Austin LeBel
****************************************************************
*** Purpose of the Method: Sets the ships id
*** Method Input: int si
*** Return Value: N/A
****************************************************************
*** Date: 04/26/2017
****************************************************************
***************************************************************/
    public void setShipID( int si )
    {
        shipID = si;
    }
/***************************************************************
*** Method Name: getWeapons
*** Method Author: Austin LeBel
****************************************************************
*** Purpose of the Method: Gets the ships weapons
*** Method Input: N/A
*** Return Value: String weapons
****************************************************************
*** Date: 04/26/2017
****************************************************************
***************************************************************/
    public String getWeapons()
    {
        return weapons;
    }
/***************************************************************
*** Method Name: setWeapons
*** Method Author: Austin LeBel
****************************************************************
*** Purpose of the Method: Sets the ships weapons
*** Method Input: String w
*** Return Value: N/A
****************************************************************
*** Date: 04/26/2017
****************************************************************
***************************************************************/
    public void setWeapons( String w )
    {
        weapons = w;
    }
/***************************************************************
*** Method Name: getEngine
*** Method Author: Austin LeBel
****************************************************************
*** Purpose of the Method: Gets the ships engine
*** Method Input: N/A
*** Return Value: String engine
****************************************************************
*** Date: 04/26/2017
****************************************************************
***************************************************************/
    public String getEngine()
    {
        return engine;
    }
/***************************************************************
*** Method Name: setEngine
*** Method Author: Austin LeBel
****************************************************************
*** Purpose of the Method: Sets the ships engine
*** Method Input: String e
*** Return Value: N/A
****************************************************************
*** Date: 04/26/2017
****************************************************************
***************************************************************/
    public void setEngine( String e )
    {
        engine = e;
    }
/***************************************************************
*** Method Name: getHyperdrive
*** Method Author: Austin LeBel
****************************************************************
*** Purpose of the Method: Gets the ships hyperdrive
*** Method Input: N/A
*** Return Value: String hyperdrive
****************************************************************
*** Date: 04/26/2017
****************************************************************
***************************************************************/
    public String getHyperdrive()
    {
        return hyperdrive;
    }
/***************************************************************
*** Method Name: setHyperdrive
*** Method Author: Austin LeBel
****************************************************************
*** Purpose of the Method: Sets the ships hyperdrive.
*** Method Input: String hd
*** Return Value: N/A
****************************************************************
*** Date: 04/26/2017
****************************************************************
***************************************************************/
    public void setHyperdrive( String hd )
    {
        hyperdrive = hd;
    }
}
