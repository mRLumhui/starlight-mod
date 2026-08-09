# 星辉模组 (Starlight Mod)

Fabric 1.20.1 模组：添加**星辉锭、星辉碎片、星辉块、星辉矿石**。星辉矿石可在主世界地下（Y -64 ~ 16）自然生成，挖掘掉落星辉碎片并给予经验；9 个星辉碎片可合成 1 个星辉锭。含自定义 16×16 蓝色材质与中文翻译。

## 如何拿到可用的 `.jar`（推荐：GitHub Actions 自动构建）

1. 在 https://github.com/new 创建仓库，例如 `starlight-mod`（公开）。
2. 用手机/电脑把本工程**所有文件**（含 `.github/`、`.gitignore`、`src/`、`build.gradle` 等）推送到该仓库的 `main` 分支。
3. 推送后，仓库顶部 **Actions** 标签页会出现 `Build Starlight Mod` 任务，约 2~4 分钟变绿勾。
4. 进入该次运行 → 右侧 **Artifacts** → 下载 `starlight-mod-jar`（解压即得 `starlight-mod-1.0.0.jar`）。
5. 同时仓库会自动发布 **Release v1.0.0**，在仓库右侧 **Releases** 里也能直接下载 jar。
6. 把 `starlight-mod-1.0.0.jar` 放入 Minecraft 的 `mods/` 文件夹，搭配 Fabric Loader 0.14.21+ 与 Fabric API 启动即可。

## 本地构建（有 JDK17 的环境）

```bash
chmod +x gradlew
./gradlew build
# 产物：build/libs/starlight-mod-1.0.0.jar
```

## 内容一览

| 类型 | 内容 |
|---|---|
| 物品 | 星辉锭 (`starlight_ingot`)、星辉碎片 (`starlight_dust`) |
| 方块 | 星辉块 (`starlight_block`)、星辉矿石 (`starlight_ore`) |
| 配方 | 9 星辉碎片 → 1 星辉锭（工作台 3×3） |
| 世界生成 | 主世界 Y -64~16，每区块约 6 次，矿脉大小 6 |
| 战利品 | 星辉矿石掉落星辉碎片 + 经验 |
| 语言 | 简体中文 (`zh_cn.json`) |

## 许可

MIT
