class OOPSBannerAppUC5
{
    public static void main(String[] args)
    {
        // Inline array initialization using String.join()
        String[] lines = {

            String.join(" ", " *** ", " *** ", " ***** ", " ***** "),
            String.join(" ", "*   *", "*   *", "*   * ", "*     "),
            String.join(" ", "*   *", "*   *", "*   * ", "*     "),
            String.join(" ", "*   *", "*   *", "***** ", " ***  "),
            String.join(" ", "*   *", "*   *", "*     ", "    * "),
            String.join(" ", "*   *", "*   *", "*     ", "    * "),
            String.join(" ", " *** ", " *** ", "*     ", "****  ")
        };

        // for-each loop to print banner
        for(String line : lines)
        {
            System.out.println(line);
        }
    }
}