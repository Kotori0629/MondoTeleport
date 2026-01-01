# MondoTeleport

一个轻量级的 Minecraft 传送增强模组，允许普通玩家使用传送命令和实体选择器。

## 功能特性

- **传送权限降级** - 将 `/tp` 命令的权限等级从 OP (等级 2) 降低到普通玩家 (等级 0)
- **实体选择器支持** - 允许普通玩家在命令中使用 `@a`、`@p`、`@e`、`@s`、`@r` 等实体选择器
- **传送日志记录** - 记录所有玩家的传送操作，便于服务器管理

## 支持版本

| Minecraft 版本 | 加载器 | 状态 |
|:-------------:|:------:|:----:|
| 1.20.1 | Forge | ✅ |
| 1.20.1 | Fabric | ✅ |
| 1.21.1 | NeoForge | ✅ |
| 1.21.1 | Fabric | ✅ |

## 安装方法

1. 确保已安装对应版本的模组加载器 (Forge/NeoForge/Fabric)
2. 下载对应版本的 MondoTeleport 模组文件
3. 将模组文件放入 `.minecraft/mods` 文件夹
4. 启动游戏

### 依赖

- **Fabric 版本**: 需要 [Fabric API](https://bbsmc.net/mod/fabric-api) 和 [Architectury API](https://bbsmc.net/mod/architectury-api)
- **NeoForge/Forge 版本**: 需要 [Architectury API](https://bbsmc.net/mod/architectury-api)

## 使用说明

安装模组后，所有玩家都可以使用以下命令：

```
/tp <目标玩家>                    # 传送到目标玩家
/tp <x> <y> <z>                   # 传送到指定坐标
/tp <玩家> <目标>                  # 将玩家传送到目标位置
/tp @a <x> <y> <z>                # 将所有玩家传送到指定坐标
/tp @e[type=minecraft:pig] ~ ~ ~  # 使用实体选择器
```

## 适用场景

- **生存服务器** - 让玩家能够自由传送，增强游戏体验
- **小型私服** - 无需设置复杂的权限系统即可使用传送功能
- **地图/小游戏** - 允许玩家在特定场景下使用传送命令

## 注意事项

- 本模组会修改原版传送命令的权限检查逻辑
- 建议仅在信任的玩家群体中使用
- 如需更精细的权限控制，请配合权限管理模组使用

## 开源协议

本项目采用 [LGPL-3.0](LICENSE) 协议开源。

## 相关链接

- [GitHub 仓库](https://github.com/Kotori0629/MondoTeleport)
- [问题反馈](https://github.com/Kotori0629/MondoTeleport/issues)
