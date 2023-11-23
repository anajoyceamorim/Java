package Ex03;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class ListaDeTarefas {

	public static void main(String[] args) {
		ArrayList<String> tarefas = new ArrayList<>();
		
		JOptionPane.showMessageDialog(null,
				"Comandos disponíveis: \n" +
						"- \"adicionar\" para adicionar uma nova tarefas\n" +
						"- \"listar\" para listar as tarefas\n" +
						"- \"concluir\" para marcar uma tarefa como concluída\n" +
						"- \"sair\" para sair do programa"
				);
		
		while(true) {
			String strOpcao = JOptionPane.showInputDialog("Digite um comando");
		
			if (strOpcao == null || strOpcao.equals("sair")) {
				JOptionPane.showMessageDialog(null, "Programa finalizado.");
				break;
			}
			
			
				switch (strOpcao) {
				case "adicionar":
					adicionar(tarefas);
					break;
				case "listar":
					listar(tarefas);
					break;
				case "concluir":
					concluir(tarefas);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente");
			}	
		}
	}
	private static void adicionar (ArrayList<String> tarefas) {
		String tarefa = JOptionPane.showInputDialog("Digite a descrição da tarefa: ");
		if (tarefa != null && !tarefa.isEmpty()) {
            tarefas.add(tarefa);
            JOptionPane.showMessageDialog(null, "Tarefa adicionada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro: Tente novamente.");
        }
	}
	private static void listar (ArrayList<String> tarefas) {
		if (tarefas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tarefas pendentes: \n (nenhuma tarefa pendente)");
        } else {
            StringBuilder lista = new StringBuilder("Tarefas pendentes:\n");
            for (int i = 0; i < tarefas.size(); i++) {
                lista.append(i + 1).append(". ").append(tarefas.get(i)).append("\n");
            }
            JOptionPane.showMessageDialog(null, lista.toString());
        }
	}
	private static void concluir (ArrayList<String> tarefas){
		if (tarefas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tarefas pendentes: \n (nenhuma tarefa pendente)");
        } else {
            listar(tarefas);
            String numTarefa = JOptionPane.showInputDialog("Digite o número da tarefa a ser concluída:");
            try {
                int num = Integer.parseInt(numTarefa) - 1;
                if (num >= 0 && num < tarefas.size()) {
                    tarefas.remove(num);
                    JOptionPane.showMessageDialog(null, "Tarefa concluída com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro: Tente novamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro: Número de tarefa inválido. Tente novamente.");
            }
        	}
		}
	}
