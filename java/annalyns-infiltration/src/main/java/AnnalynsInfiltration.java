class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if(knightIsAwake)
        {
            return false;
        }
        if(!knightIsAwake)
        {
            return true;
        }

            throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFastAttack() method");

        }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
try {
    if (archerIsAwake == true || knightIsAwake == true || prisonerIsAwake == true) {
        return true;
    }
    else
    {
        return false;
    }
}
catch(UnsupportedOperationException e)
                {
        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSpy() method");
}
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        try
        {
            if(archerIsAwake==false)
            {
                if(prisonerIsAwake==true)
                {
                    return true;
                }

            }
            return false;
        }
        catch(UnsupportedOperationException e) {
            throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");
        }
        }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        try
        {
            if((petDogIsPresent==true && archerIsAwake==false) || (prisonerIsAwake==true && archerIsAwake==false && knightIsAwake==false))
            {
                return true;
            }
            return false;
        }
        catch(UnsupportedOperationException e) {
            throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFreePrisoner() method");
        }
    }
}
