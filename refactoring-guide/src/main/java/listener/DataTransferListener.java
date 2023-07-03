package listener;

// 创建Listener监听器，检测在数据传递过程中每个动作，并执行相应的逻辑
// 1. 创建要监听的不同的动作
// 2. 针对每个动作执行相应的逻辑
public class DataTransferListener {

    private final boolean showLog;

    public DataTransferListener(boolean showLog) {
        this.showLog = showLog;
    }

    public void onProcessing() {
        // notice data
    }

    public void onDataTruncation() {
        // write to output file
    }

    public void onError() {
        // ReportHelper.addNewFailedTable(error);
        // ReportHelper.addError(error.toString());
    }
}
