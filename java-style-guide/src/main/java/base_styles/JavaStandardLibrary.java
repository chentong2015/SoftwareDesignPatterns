package base_styles;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.SplittableRandom;
import java.util.concurrent.ThreadLocalRandom;

// 1. 了解Java源码并使用标准类库(精心设计好的API)，忽略API底层实现的细节
// 2. 其次使用高级第三方类库
// 3. 自定义实现功能
public class JavaStandardLibrary {

    // TODO. 从Java7开始，不再使用Random生成随机数
    // - Random使用线程安全的伪随机数生成器，造成过度同步  => 将每个操作都进行同步
    // - ThreadLocalRandom能够产出高质量的随机数，高性能 => 只用于单线程
    // - SplittableRandom并行一共随机数Stream，速度快
    public void getRandomNumber(int n) throws NoSuchAlgorithmException {
        int value1 = new Random().nextInt(n);

        int value2 = ThreadLocalRandom.current().nextInt(n);

        SplittableRandom random = new SplittableRandom();
        int value3 = random.nextInt();

        // SecureRandom is preferred to Random 企业中推荐使用SecureRandom
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextInt();
        Random rand = SecureRandom.getInstanceStrong();
        int value4 = rand.nextInt();
    }
}
