
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        try
        {
            return new int[]{0, 2, 5, 3, 7, 8, 4};
        }
        catch(UnsupportedOperationException e) {
            throw new UnsupportedOperationException("Please implement the BirdCount.getLastWeek() method");
        }
    }

    public int getToday() {
        try
        {
            if(birdsPerDay.length==0)
            {
                return 0;
            }
            return birdsPerDay[birdsPerDay.length-1];
        }
        catch(UnsupportedOperationException e) {
            throw new UnsupportedOperationException("Please implement the BirdCount.getToday() method");
        }
    }

    public void incrementTodaysCount() {
        try
        {
            birdsPerDay[birdsPerDay.length-1]++;
        }
        catch(UnsupportedOperationException e) {
            throw new UnsupportedOperationException("Please implement the BirdCount.incrementTodaysCount() method");
        }
    }

    public boolean hasDayWithoutBirds() {
        try
        {
            for(int bird:birdsPerDay)
            {
                if(bird==0)
                {
                    return true;
                }
            }
            return false;
        }
        catch(UnsupportedOperationException e) {
            throw new UnsupportedOperationException("Please implement the BirdCount.hasDayWithoutBirds() method");
        }
    }

    public int getCountForFirstDays(int numberOfDays) {
        try
        {
            int count=0;
            for(int i=0;i<numberOfDays;i++)
            {
                if(i<birdsPerDay.length)
                {
                    count=count+birdsPerDay[i];
                }
                else
                {
                    return count;
                }

            }
            return count;
        }
        catch(UnsupportedOperationException e) {
            throw new UnsupportedOperationException("Please implement the BirdCount.getCountForFirstDays() method");
        }
    }

    public int getBusyDays() {
        try
        {
            int count=0;
            for(int bird:birdsPerDay)
            {
                if(bird>=5)
                {
                    count++;
                }

            }
            return count;
        }
        catch(UnsupportedOperationException e) {
            throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
        }
    }
}
