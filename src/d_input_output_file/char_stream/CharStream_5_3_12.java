public class CharStream_5_3_12 {
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buffer = new byte[4096];
        int nRead;
        while ((nRead = inputStream.read(buffer)) != -1) {
            out.write(buffer, 0, nRead);
        }
        return new String(out.toByteArray(), charset);

    }
}