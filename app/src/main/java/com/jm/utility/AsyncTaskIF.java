package com.jm.utility;

public interface AsyncTaskIF {
	void doExecute();
	void cancel();
	void done(boolean isCancel);
}
