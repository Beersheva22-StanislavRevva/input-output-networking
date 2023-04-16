package telran.mygit;

import java.io.Serializable;
import java.nio.file.Path;
import java.util.List;

public interface GitRepository extends Serializable {

	String GIT_FILE = ".mygit";
	GitRepositoryImpl init();
	String commit(String commitMessage);
	List<FileState> info();
	String createBranch(String branchName);
	String renameBranch(String branchName, String newName);
	String deleteBranch(String branchName);
	List<CommitMessage> log();
	List<String> branches(); 
	List<Path> commitContent(String commitName);
	String switchTo(String name); 
	String getHead(); 
	void save(); 
	String addIgnoredFileNameExp(String regex);
	
	
}
