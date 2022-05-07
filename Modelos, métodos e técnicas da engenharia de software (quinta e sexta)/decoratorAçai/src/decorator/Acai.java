package decorator;

public class Acai implements Adicional {
   /* private String name;

    public Açai(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        File file = new File(name);
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return new String(buffer); 
	
	
    }*/
	
	private String descricao = "açai";
	private float custoI = 10;
	
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public float custo() {
		return custoI;
	}

	public void setCustoI(float custoI) {
		this.custoI = custoI;
	}

	@Override
	public String getDescricão() {
		return descricao;
	}
	
}