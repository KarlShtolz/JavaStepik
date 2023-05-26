public class ByteStream {
    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int b;
        int crc = 0;
        try {
            while ((b = inputStream.read()) != -1) {
                crc = Integer.rotateLeft(crc, 1) ^ b;
            }
        } catch (IOException e) {
            throw new IOException();
        }

        return crc;
    }

}