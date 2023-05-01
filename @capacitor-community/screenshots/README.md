<p align="center"><br><img src="https://user-images.githubusercontent.com/236501/85893648-1c92e880-b7a8-11ea-926d-95355b8175c7.png" width="128" height="128" /></p>
<h3 align="center">Screenshots</h3>
<p align="center"><strong><code>dtarnawsky/capscreenshots</code></strong></p>
<p align="center">
  Capacitor plugin for preventing screenshots on iOS and Android.
</p>

## Maintainers

| Maintainer | GitHub | Social |
| -----------| -------| -------|
| Damian Tarnawsky | [dtarnawsky](https://github.com/dtarnawsky) | [@damiantarnawsky](https://twitter.com/damiantarnawsky) |

## Versions

| Plugin | Capacitor | Documentation                                                                     |
| ------ | --------- | --------------------------------------------------------------------------------- |
| 4.x    | 4.x       | [README](https://github.com/dtarnawsky/screenshots/blob/main/README.md) |

## Installation

```bash
npm install screenshots@url-for-this-git-repo
npx cap sync
```

## Usage
```typescript
import { Screenshots } from 'screenshots';

// Prevent screenshots
await Screenshots.disableScreenshots();

// Allow screenshots
await Screenshots.enableScreenshots();
```

## API

<docgen-index>

* [`disableScreenshots()`](#disablescreenshots)
* [`enableScreenshots()`](#enablescreenshots)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### disableScreenshots()

```typescript
disableScreenshots() => Promise<void>
```

Disable screenshots

**Since:** 4.0.0

--------------------


### enableScreenshots()

```typescript
enableScreenshots() => Promise<void>
```

Enable screenshots

**Since:** 4.0.0

--------------------

</docgen-api>
